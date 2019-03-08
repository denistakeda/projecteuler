(ns projecteuler.002)

(defn even-fib
  "The lazy sequence of even Fibonachi numbers"
  ([]
   (even-fib 2 8))
  ([a b]
   (lazy-seq (cons a (even-fib b (+ a (* 4 b)))))))

(let [lim      4000000
      sequence (take-while #(< % lim) (even-fib))]
  (reduce + sequence))
