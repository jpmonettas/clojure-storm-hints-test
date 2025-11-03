(ns core
  (:import [clojure.testfixtures Component MyView MyView$Builder]))

#_(let [comp-builder (Component/newBuilder)
      list-view-builder (MyView/newBuilder)
      builder (.setMyView comp-builder ^MyView$Builder (.build list-view-builder))]
    (.build builder))

#_(-> (Component/newBuilder)
      (.setMyView ^MyView$Builder
                  (.build (MyView/newBuilder)))
      .build)
