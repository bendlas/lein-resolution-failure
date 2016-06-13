# Demonstrates a leiningen dependency resolution failure

```
(cd orig-deadbeef && lein install)
(cd other-deadbeef && lein install)
cd deadbeef-user && lein run yo
```

## Expected result

A hello world message should be printed 3 times

## Result as of leiningen 2.6.1

An exception about one of the deadbeef dependencies not found
