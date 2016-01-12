(ns app.app
  (:require [cljsjs.material]
            [reagent.core :as reagent]))

(defn fixed-header-and-drawer-component [content]
  [:div.mdl-layout.mdl-js-layout.mdl-layout--fixed-drawer.mdl-layout--fixed-header
   [:header.mdl-layout__header
    [:div.mdl-layout__header-row
     [:div.mdl-layout-spacer]]]
   [:div.mdl-layout__drawer
    [:span.mdl-layout-title "Resume"]
    [:nav.mdl-navigation
     [:a.mdl-navigation__link {:href "#"} "About"]]]
   [:main.mdl-layout__content
    [:div.page-content
     content]]])

(defn some-component []
  [:div
   [fixed-header-and-drawer-component
    [:h3 "This is your app"]]])
   



(defn init []
  (reagent/render-component [some-component]
                            (.getElementById js/document "container")))
