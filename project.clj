(defproject tracker "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :min-lein-version "2.6.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [coast "0.6.9"]]
  :repl-options {:init-ns tracker.core}
  :main tracker.core
  :plugins [[lein-environ "1.1.0"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :aliases {"db/migrate"   ["run" "-m" "coast.migrations/migrate"]
            "db/rollback"  ["run" "-m" "coast.migrations/rollback"]
            "db/migration" ["run" "-m" "coast.migrations/create"]
            "db/create"    ["run" "-m" "coast.db/create" "tracker"]
            "db/drop"      ["run" "-m" "coast.db/drop" "tracker"]

            "model/gen"      ["run" "-m" "coast.generators/model" "tracker"]
            "controller/gen" ["run" "-m" "coast.generators/controller" "tracker"]
            "view/gen"       ["run" "-m" "coast.generators/view" "tracker"]
            "mvc/gen"        ["run" "-m" "coast.generators/mvc" "tracker"]
            "sql/gen"        ["run" "-m" "coast.generators/sql" "tracker"]}
  :profiles {:uberjar {:aot :all
                       :uberjar-name "tracker.jar"}})
