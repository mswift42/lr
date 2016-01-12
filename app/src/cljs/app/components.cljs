(ns app.components)

(defn section-component
  [content]
  [:div.ressection
   content])

(defn about-component
  [description]
  [:div#about
   [section-component
    [:div.about
     [:div.aboutheader
      [:h3 "Profile"]]
     [:div.aboutdescription
      description]]]])
