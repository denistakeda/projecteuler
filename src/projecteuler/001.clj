(ns projecteuler.001)

(defn sum-divisible-by [limit denominator]
  (let [p (quot limit denominator)]
    (-> (inc p)
        (* p)
        (* denominator)
        (quot 2))))

(defn find-sum [limit]
  (-> (sum-divisible-by limit 3)
      (+ (sum-divisible-by limit 5))
      (- (sum-divisible-by limit 15))))

(find-sum 999)
