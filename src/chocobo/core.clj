(ns chocobo.core
    (:require [chocobo.feeding :as feeding]
              [chocobo.coloring :as coloring])
    (:gen-class))
  
  (defn format-list
    "Ritorna una stringa da una sequenza"
    [coll]
    (reduce
      str
      (map
        #(str % "\n")
        coll)))
  
  (defn -main
    "Main funciton"
    [& args]
    (let [current (first args)
          target (second args)
          current-data (coloring/find-by-name current)
          target-data (coloring/find-by-name target)]
      (do
        (println (str "*** ChocoColor 0.2 - https://github.com/DarkArtek/ChocoColor"))
        (println " ")
        (if
          (and
            (= 2 (count args))
            (= current (:name current-data))
            (= target (:name target-data)))
          (do
            (println (str "---> Da " (:name current-data) " a " (:name target-data) ". Ecco a voi gli ingredienti:"))
            (let [chain (feeding/feed-chain (:rgb current-data) (:rgb target-data))]
              (println (format-list (filter #(not (nil? %)) (feeding/feed-chain-totals chain))))
              (println "---> Date da mangiare al vostro chocobo in questo ordine:")
              (println (format-list (feeding/feed-chain-names chain))))
              (println "---> Ecco fatto. Grazie per aver usato ChocoColor.")
              (println "\n")
              (println "---> Venite a trovarci su https://ffxivita.it e su https://bit.ly/discovery-eorzea"))
          (do
            (println "---> Colori Disponibili:")
            (println (format-list (map #(:name %) coloring/color-data)))
            (println "ERRORE:  per favore usa i colori come in esempio")
            (println "Esempio: java -jar choco-color.jar \"Desert Yellow\" \"Ash Gray\"")
            (println "Esempio: choco-color.exe \"Desert Yellow\" \"Ash Gray\""))))))