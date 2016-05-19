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
    [:div.mdl-grid
     [:div.mdl-cell.mdl-cell--3-col-desktop.mdl-cell--12-col-phone.mdl-card__title
      [:h3 "About"]]
     [:div.mdl-cell.mdl-cell--8-col.mdl-cell--12-col-phone
      description]]]])


(defn navlink-component
  "navigation link component.
   Consists of navigation link, link title, and
   mdl icon."
  [navlinklst]
  (let [[name icon] navlinklst]
    [:li.mdl-list__item
     [:span.mdl-list__item-primary-content.mdl-grid
      [:i.material-icons.mdl-list__item-icon.mdl-cell.mdl-cell--2-col.mdl-cell--middle icon]
      [:a.mdl-navigation__link.mdl-cell.mdl-cell--2-col.mdl-cell--middle
       {:href (str "#" (.toLowerCase name))}
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
      [:h4 name]]
     [:div.contactphonemail.mdl-grid
      [:div.mdl-cell.mdl-cell--4-col
       [:i.material-icons "phone"]]
      [:div.mdl-cell.mdl-cell--4-col
       [:i.material-icons "email"]]]
     [:div.contact.mdl-grid
      [:div.mdl-cell.mdl-cell--4-col
       [:p phone]]
      [:div.mdl-cell.mdl-cell--4-col
       [:p email]]]]
    ]])

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
  [:div#education
   [section-component
    (into [:div.edu]
          (map #(single-education-component %) educationlist))]])

(defn skilldetail-component
  [skilldetail]
  [:span skilldetail])

(defn single-skill-component
  [skill]
  [:div.mdl-card
   [:div.skillcategory.mdl-card__title
    [:h2 (:category skill)]]
   [:div.skilllevel.mdl-card__title
    [:h3 (:level skill)]]
   (into [:div.skilldetail]
         (map #(skilldetail-component %) (:details skill)))])

(defn skill-component
  [skills]
  [:div#skills
   [section-component
    (into [:div.skills]
          (map #(single-skill-component %) skills))]])

(defn single-language-component
  [language]
  [:div.mdl-card
   [:div.mdl-card__title
    [:span (:lang language)]]
   [:div.mdl-card__supporting-text
    [:span (:level language)]]])

(defn language-component
  [languages]
  [:div#languages
   [section-component
    (into [:div.lang]
          (map #(single-language-component %) languages))]])

(defn single-award-component
  [award]
  [:div.mdl-card                                   ;
   [:div.mdl-card__title.awardtitle
    [:h2 (:title award)]]
   [:div.mdl-card__supporting-text.awardawarded
    [:h3 (:awarded award)]]
   [:div.mdl-card__supporting-text.awarddetails
    [:p (:details award)]]])

(defn award-component
  [awards]
  [:div#awards
   [section-component
    (into [:div.award]
          (map #(single-award-component %) awards))]])

(defn single-social-profile-component
  [social-profile]
  [:div.mdl-card
   [:div.mdl-card__title.socialprofileprovider
    [:h2 (:provider social-profile)]]
   [:div.mdl-card__supporting-text.socialprofilehandle
    [:h3 [:a {:href (:handle social-profile)} (:handle social-profile)]]]])


(defn social-profile-component
  [social-profile-list]
  [:div#social
   [section-component
    (into [:div.socialprofile]
          (map #(single-social-profile-component %) social-profile-list))]])


