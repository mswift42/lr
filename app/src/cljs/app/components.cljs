(ns app.components)

(defn section-component
  [content]
  [:div.singlecard
   [:div.mdl-card.mdl-shadow--2dp.ressection
    content]])

(defn about-component
  [description]
  [:div#about
   [section-component
    [:div.about
     [:div.aboutheader
      [:h3 "Profile"]]
     [:div.aboutdescription
      description]]]])

(defn navlink-component
  "navigation link component.
   Consists of navigation link, link title, and
   mdl icon."
  [navlinklst]
  (let [[name icon] navlinklst]
    [:li.mdl-list__item
     [:span.mdl-list__item-primary-content
      [:i.material-icons.mdl-list__item-icon icon]
      [:a.mdl-navigation__link {:href (str "#" (.toLowerCase name))}
       name]]]))

(defn sidenav-component
  [linkslist]
  (into [:ul.catlist.mdl-list]
        (map #(navlink-component %) linkslist)))

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

(defn employment-component
  [employments]
  [:div#employment
   [section-component
    (into [:div.emploment] (map #(single-employment-component %) employments))]])

(defn single-education-component
  [education]
  [:div.education.mdl-card
   [:div.education--period--institution.mdl-card__title
    [:div.mdl-card__title-text
     [:h4 (:period education)]]
    [:div.mdl-card__title-text
     [:h4 (:institution education)]]]
   [:div.education--degree.mdl-card__supporting-text
    [:div.degree
     [:h4 (:degree education)]]]
   [:div.educaton--details.mdl-card__supporting-text
    [:div.details
     [:h4 (:details education)]]]])

(defn education-component
  [educationlist]
  [:div#educaton
   [section-component
    (into [:div.edu]
          (map #(single-education-component %) educationlist))]])

