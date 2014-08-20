/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.runtime.base.internal.registry;

import org.gradle.runtime.base.InvalidComponentModelException;

public abstract class AbstractTypeBuilder<T> implements TypeBuilderInternal<T> {
    private final Class<?> markerAnnotation;
    Class<? extends T> implementation;

    public AbstractTypeBuilder(Class<?> markerAnnotation){
        this.markerAnnotation = markerAnnotation;
    }

    public TypeBuilderInternal<T> defaultImplementation(Class<? extends T> implementation) {
        if (this.implementation != null) {
            throw new InvalidComponentModelException(String.format("%s method cannot set default implementation multiple times.", markerAnnotation.getSimpleName()));
        }
        this.implementation = implementation;
        return this;
    }

    public Class<? extends T> getDefaultImplementation() {
        return this.implementation;
    }
}