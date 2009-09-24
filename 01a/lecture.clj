(use :reload-all 'clojure.contrib.test-is)

(def a (* 5 5))

(defn d [] (* 5 5))

(defn square [x] (* x x))

(run-tests)