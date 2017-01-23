/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface CompletionStage<T>
{
public abstract <U> java.util.concurrent.CompletionStage<U> thenApply(java.util.function.Function<? super T, ? extends U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> thenApplyAsync(java.util.function.Function<? super T, ? extends U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> thenApplyAsync(java.util.function.Function<? super T, ? extends U> fn, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenAccept(java.util.function.Consumer<? super T> action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenAcceptAsync(java.util.function.Consumer<? super T> action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenAcceptAsync(java.util.function.Consumer<? super T> action, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenRun(java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenRunAsync(java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> thenRunAsync(java.lang.Runnable action, java.util.concurrent.Executor executor);
public abstract <U, V> java.util.concurrent.CompletionStage<V> thenCombine(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiFunction<? super T, ? super U, ? extends V> fn);
public abstract <U, V> java.util.concurrent.CompletionStage<V> thenCombineAsync(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiFunction<? super T, ? super U, ? extends V> fn);
public abstract <U, V> java.util.concurrent.CompletionStage<V> thenCombineAsync(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiFunction<? super T, ? super U, ? extends V> fn, java.util.concurrent.Executor executor);
public abstract <U> java.util.concurrent.CompletionStage<java.lang.Void> thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiConsumer<? super T, ? super U> action);
public abstract <U> java.util.concurrent.CompletionStage<java.lang.Void> thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiConsumer<? super T, ? super U> action);
public abstract <U> java.util.concurrent.CompletionStage<java.lang.Void> thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U> other, java.util.function.BiConsumer<? super T, ? super U> action, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterBoth(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterBothAsync(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterBothAsync(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action, java.util.concurrent.Executor executor);
public abstract <U> java.util.concurrent.CompletionStage<U> applyToEither(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Function<? super T, U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Function<? super T, U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Function<? super T, U> fn, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> acceptEither(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Consumer<? super T> action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Consumer<? super T> action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T> other, java.util.function.Consumer<? super T> action, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterEither(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterEitherAsync(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action);
public abstract  java.util.concurrent.CompletionStage<java.lang.Void> runAfterEitherAsync(java.util.concurrent.CompletionStage<?> other, java.lang.Runnable action, java.util.concurrent.Executor executor);
public abstract <U> java.util.concurrent.CompletionStage<U> thenCompose(java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> thenComposeAsync(java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> thenComposeAsync(java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> fn, java.util.concurrent.Executor executor);
public abstract <U> java.util.concurrent.CompletionStage<U> handle(java.util.function.BiFunction<? super T, java.lang.Throwable, ? extends U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> handleAsync(java.util.function.BiFunction<? super T, java.lang.Throwable, ? extends U> fn);
public abstract <U> java.util.concurrent.CompletionStage<U> handleAsync(java.util.function.BiFunction<? super T, java.lang.Throwable, ? extends U> fn, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<T> whenComplete(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> action);
public abstract  java.util.concurrent.CompletionStage<T> whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> action);
public abstract  java.util.concurrent.CompletionStage<T> whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> action, java.util.concurrent.Executor executor);
public abstract  java.util.concurrent.CompletionStage<T> exceptionally(java.util.function.Function<java.lang.Throwable, ? extends T> fn);
public abstract  java.util.concurrent.CompletableFuture<T> toCompletableFuture();
}
