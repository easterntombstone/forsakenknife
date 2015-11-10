(defproject forsakenknife "0.1.0-SNAPSHOT"
  :description "Generate an ssh key and add entry to ssh config file."
  :url "git remote add origin git@github.com:easterntombstone/forsakenknife.git"
  :license {:name "GNU GPL 3"
            :url "http://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[lein-ancient "0.6.8"] [lein-kibit "0.1.2"] [jonase/eastwood "0.2.1"] [lein-bikeshed "0.2.0"] [lein-cloverage "1.0.6"]]
  :aliases {"omni" ["do" ["clean"] ["test"] ["with-profile" "production" "deps" ":tree"] ["ancient"] ["kibit"] ["bikeshed" "-m" "1000"] ["cloverage"]]}
  )
