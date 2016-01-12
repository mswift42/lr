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

(defn contact-component
  [name email phone]
  [:div#contact
   [section-component
    [:div.contact
     [:div.contactname
      [:h3 name]]
     [:div.contactphonemail.mdl-grid
      [:div.mdl-cell.mdl-cell--4-col
       [:i.material-icons "phone"]]
      [:div.mdl-cell.mdl-cell--4-col
       [:i.material-icons "email"]]]
     [:div.contact.mdl-grid
      [:div.mdl-cell.mdl-cell--4-col
       [:p phone]]
      [:div.mdl-cell.mdl-cell--4-col
       [:p email]]]]]])
