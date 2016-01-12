(ns app.components)

(defn section-component
  [content]
  [:div.ressection
   content])

(defn about-component
  [description]
  [:div
   [section-component
    [:div.aboutheader
     [:h3 "Profile"]]
    [:div.aboutdescription
     description]]])
