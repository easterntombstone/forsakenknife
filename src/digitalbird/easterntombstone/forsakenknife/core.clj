(ns digitalbird.easterntombstone.forsakenknife.core)
(use '[clojure.java.shell :only [sh]])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn- internalimpl "The internal implementation method" [host hostname user keycomment configfile keyfile passphrase]
  (.delete keyfile)
  (sh "ssh-keygen" "-f" (str keyfile) "-C" keycomment "-P" passphrase)
  {:passphrase passphrase}
)
