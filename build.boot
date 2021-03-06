(set-env!
  :dependencies '[[org.clojure/clojure       "1.7.0-RC1"  :scope "provided"]
                  [boot/core                 "2.0.0"      :scope "provided"]
                  [adzerk/bootlaces          "0.1.11"     :scope "test"]
                  [org.clojure/clojurescript "0.0-3269"   :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.0-3269-1")

(bootlaces! +version+)

(task-options!
 pom  {:project     'adzerk/boot-cljs
       :version     +version+
       :description "Boot task to compile ClojureScript applications."
       :url         "https://github.com/adzerk/boot-cljs"
       :scm         {:url "https://github.com/adzerk/boot-cljs"}
       :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})
