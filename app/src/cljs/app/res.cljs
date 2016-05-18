(ns app.res)

(def resume
  {:profile "Martin Haesler is a former sales man for plumbing and heating projects, who after 17 years of working in this line of work, decided it was time for a change, see something of the world, and try for a completely different career path. Having always been interested in computer technology, an avid Linux user for many years, he decided on programming as a new career.\nMartin Haesler is quick to learn new things, self motivated and eager to improve."
   :contact {:name "Martin Haesler"
             :email "martin.haesler@gmail.com"
             :phone "07481 598020"}
   :projects [{:title "ThemeCreator"
               :url "https://github.com/mswift42/themecreator"
               :image "images/tc1chrome.png"
               :description "ThemeCreator lets you easily create beautiful color themes for IntelliJ Editors, Atom, Textmate and Emacs.\nThemeCreator is a Clojurescript app, built using the reagent framework."}]
   :employment [{:company "Pfeiffer & May GmbH + Co KG"
                 :title "Head of Heating Department"
                 :time "2008 - 2012"
                 :description "Supervising of team members. Negotiating prices and special deals with suppliers and customers. Developing weekly promotions for heating products. Determining of prices and conditions for our supplying of goods for bigger projects. Training and teaching of apprentices. Marketing of products utilising renewable energy. Compiling annual reports and goals for the following year."}]})

(def sample-resume
  {:profile "Richard hails from Tulsa. He has earned degrees from the University of Oklahoma and Stanford. (Go Sooners and Cardinals!) Before starting Pied Piper, he worked for Hooli as a part time software developer. While his work focuses on applied information theory, mostly optimizing lossless compression schema of both the length-limited and adaptive variants, his non-work interests range widely, everything from quantum computing to chaos theory. He could tell you about it, but THAT would NOT be a “length-limited” conversation! "
   :contact {:name "Richard Hendriks"
             :email "richard.hendriks@mail.com"
             :phone "(912) 555-4321"}
   :projects [{:title "TODO App"
               :url "todoapp.com"
               :image "images/tc1chrome.png"
               :description "sophisticated todo app."}
              {:title "Calculus"
               :url "www.dothemath.com"
               :image "images/wall1.jpg"
               :description "all encompassing calculator"}]
   :employment [{:company "Pied Piper",
                 :title "CEO/President"
                 :time "December 2013 - December 2014"
                 :description "Pied Piper is a multi-platform technology based on a proprietary universal compression algorithm that has consistently fielded high Weisman Scores™ that are not merely competitive, but approach the theoretical limit of lossless compression.\n Build an algorithm for artist to detect if their music was violating copy right infringement laws\n Successfully won Techcrunch Disrupt\n Optimized an algorithm that holds the current world record for Weisman Scores"}]
   :education [{:period "2011 - 2014"
                :institution "University of Oklahoma"
                :degree "Backelor, Information Technology"
                :details "Bla Blah"}
               {:period "2009 - 2011"
                :institution "Finishing school"
                :degree "Master of Excellence"
                :details "Richard amazed with culinary artistry"}]
   :skills [{:category "Web Develoment"
             :level "Master"
             :details ["HTML" "CSS" "Javascript"]}
            {:category "Compression"
             :level "Master"
             :details ["Mpeg" "MP4" "GIF"]}]
   :languages [{:lang "English"
                :level "native speaker"}]
   :awards [{:title "Digital Compression Pioneer Award - Techcrunch"
             :awarded "01 November 2014"
             :details "There is no spoon"}]
   :social-profiles [
                     {:provider "twitter"
                      :handle "tweety11"}
                     {:provider "Soundcloud"
                      :handle "https://soundcloud.com/mymusic"}]})
