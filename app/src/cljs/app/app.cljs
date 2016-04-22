(ns app.app
  (:require [cljsjs.material]
            [reagent.core :as reagent]
            [app.components :as comps]
            [app.res :refer [resume]]))

(defn fixed-header-and-drawer-component [content]
  [:div.mdl-layout.mdl-js-layout.mdl-layout--fixed-drawer.mdl-layout--fixed-header
   [:header.mdl-layout__header
    [:div.mdl-layout__header-row
     [:div.mdl-layout-spacer]]]
   [:div.mdl-layout__drawer
    [:span.mdl-layout-title "Categories"]
    [:nav.mdl-navigation
     [comps/sidenav-component [["Contact" "contact_mail"]
                               ["Profile" "account_circle"]
                               ["Projects" "group_work"]
                               ["Employment" "history"]]]
     ]]
   [:main.mdl-layout__content
    [:div.page-content
     content]]])

(defn main-component []
  [:div
   [fixed-header-and-drawer-component
    [:div
     [comps/contact-component (:name (:contact resume))
      (:email (:contact resume))
      (:phone (:contact resume))]
     [comps/about-component
      [:p (:profile resume)]]
     [comps/projects-component
      (:projects resume)]
     [comps/employment-component
      (:employment resume)]]]])




(defn init []
  (reagent/render-component [main-component]
                            (.getElementById js/document "container")))
