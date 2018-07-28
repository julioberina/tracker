# tracker

## Start

```bash
git clone git@github.com:your-user-name/tracker.git
cd tracker
psql -c "create database tracker_development"
lein migrate
```

## Dev

```bash
lein repl
```

```clojure
; in the repl
(start)
```

```bash
http :1337 # hello, world!
```

## Prod (heroku)

```bash
heroku create tracker
git push heroku master
heroku addons:create heroku-postgresql
heroku config:add SECRET=$(openssl rand -base64 8 |md5 |head -c16)

heroku run lein migrate
# good to go!
```
