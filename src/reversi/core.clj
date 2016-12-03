(ns reversi.core
  (:gen-class))

(def board (atom [[:x :x :x :x :x :x :x :x]
                  [:x :x :x :x :x :x :x :x]
                  [:x :x :x :x :x :x :x :x]
                  [:x :x :x :B :W :B :x :x]
                  [:x :x :x :W :B :x :x :x]
                  [:x :x :x :x :x :x :x :x]
                  [:x :x :x :x :x :x :x :x]]))

(def black (atom []))

(def current-turn (atom :B))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn get-alternate-key-position [key row]
  (keep-indexed #(when (= %2 key) %1) row))

(defn get-possitions []
  [(map (fn [x] ((partial get-alternate-key-position :W) x)) @board)
   (map (fn [x] ((partial get-alternate-key-position :B) x)) @board)] )

(defn get-possible-moves [turn current-positions]
  )
