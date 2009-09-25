;;(use :reload-all 'clojure.contrib.test-is)

(defn square [x]
  (* x x))

(defn sum-of-2-squares [x y]
  (+ (square x) (square y)))

(defn sum-of-2-largest-squares-of-3 [x y z]
  (cond (and (<= x y) (<= x z)) (sum-of-2-squares y z)
        (and (<= x y) (<= x z)) (sum-of-2-squares x z)
        :else (sum-of-2-squares x y)))

;;(deftest test-square
;;  (is (= (square 1) 1))
;;  (is (= (square 2) 4)))

;;(run-tests)