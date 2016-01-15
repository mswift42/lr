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

(defn single-project-component
  [project]
  [:div
   [:div.projecttitle
    [:a {:href (:url project)} (:title project)]]
   [:div.projectimg
    [:img {:src (:image project) :alt (:title project)} ]]
   [:div.projectdesc
    [:p (:description project)]]])

(defn projects-component
  [projects]
  [:div#projects
   [section-component
    (into [:div.project] (map #(single-project-component %) projects))]])

(defn single-employment-component
  [employment]
  [:div
   [:div.companyandtitle.mdl-grid
    [:div.mdl-cell.mdl-cell--4-col.employer
     [:h3 (:company employment)]]
    [:div.mdl-cell.mdl-cell--4-col.companyposition
     [:h3 (:title employment)]]]
   [:div.yearsanddescription.mdl-grid
    [:div.mdl-cell-mdl-cell--2-col.years
     [:h5 (:time employment)]]
    [:div.mdl-cell-mdl-cell--8-col.employmentdescription
     [:p (:description employment)]]]])

(defn emploment-component
  [employments]
  [:div#employment
   [section-component
    (into [:div.emploment (map #(single-employment-component %) employments)])]])

