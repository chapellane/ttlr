```clojure
[com.ninjakoala/ttlr "1.0.0"]
```

```clojure
(ns yourapp
  (:require [ninjakoala.ttlr :as ttlr]))

(defn update-costly-thing
  []
  (Thread/sleep 10000)
  {:some "data"})

(ttlr/init :cpu-count 1)

; Wait ten seconds after this next call (we're seeding the state with the result of (update-costly-thing))
(ttlr/schedule :costly-thing update-costly-thing (* 60 1000) (update-costly-thing))

; Now retrieve your costly thing quickly and it'll be updated in the background every minute.
(ttlr/state :costly-thing)
```

# ttlr

TTL with refresh. You `schedule` refreshes to take place and store things under a particular `:key-name`.

## Why not memoize or core.cache?

Because we wanted a way to be able to retrieve things in the background rather than have a user take the penalty of retrieving the item when the cache expires.

## License

Copyright © 2014 Neil Prosser

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
