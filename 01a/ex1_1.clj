(use :reload-all 'clojure.contrib.test-is)

(def a 3)
(def b (+ a 1))

(deftest test-ex1_1
  (is (=
       10
       10))
  (is (=
       (+ 5 3 4)
       12))
  (is (=
       (- 9 1)
       8))
  (is (=
       (/ 6 2)
       3))
  (is (=
       (+ (* 2 4) (- 4 6))
       6))
  (is (= a 3))
  (is (= b 4))
  (is (=
       (+ a b (* a b))
       19))
  (is (=
       (= a b)
       false))
  (is (=
       (if (and (> b a) (< b (* a b)))
         b
         a)
       4))
  (is (=
       (cond (= a 4) 6
             (= b 4) (+ 6 7 a)
             :else 25)
       16))
  (is ( =
      (+ 2 (if (> b a) b a))
      6))
  (is (=
      (* (cond (> a b) a
               (< a b) b
               :else -1))
      4))
  )

 (run-tests)