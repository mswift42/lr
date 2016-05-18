(ns app.app
  (:require [cljsjs.material]
            [reagent.core :as reagent]
            [app.components :as comps]
            [app.res :refer [sample-resume]]))

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
     [comps/contact-component (:name (:contact sample-resume))
      (:email (:contact sample-resume))
      (:phone (:contact sample-resume))]
     [comps/about-component
      [:p (:profile sample-resume)]]
     [comps/projects-component
      (:projects sample-resume)]
     [comps/employment-component
      (:employment sample-resume)]
     [comps/education-component
      (:education sample-resume)]]]])




(defn init []
  (reagent/render-component [main-component]
                            (.getElementById js/document "container")))
