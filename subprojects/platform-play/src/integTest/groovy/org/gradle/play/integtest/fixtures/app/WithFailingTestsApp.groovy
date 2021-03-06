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

package org.gradle.play.integtest.fixtures.app

import org.gradle.integtests.fixtures.SourceFile

class WithFailingTestsApp extends BasePlayApp {
    List<SourceFile> appSources
    List<SourceFile> viewSources
    List<SourceFile> confSources
    List<SourceFile> testSources

    public WithFailingTestsApp(){
        appSources = sourceFiles("app", "playnewapp");
        viewSources = sourceFiles("app/views", "playnewapp");
        confSources = sourceFiles("conf", "shared") + sourceFiles("conf", "playnewapp")
        testSources = sourceFiles("test") + sourceFiles("test", "playnewapp")
    }
}
