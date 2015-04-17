package com.gigigo.dagger2demo.di;

import javax.inject.Scope;

/**
 * A scoping annotation to permit objects whose lifetime should
 * conform to the life of the activity to be memoized in the
 * correct component.
 */
@Scope
//@Retention(RUNTIME)
public @interface PerActivityScope {
}