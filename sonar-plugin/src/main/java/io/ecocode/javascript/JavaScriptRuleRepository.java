/*
 * ecoCode JavaScript plugin - Provides rules to reduce the environmental footprint of your JavaScript programs
 * Copyright © 2023 Green Code Initiative (https://www.ecocode.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package io.ecocode.javascript;

import org.sonar.plugins.javascript.api.CustomRuleRepository;
import org.sonar.plugins.javascript.api.JavaScriptCheck;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("deprecation")
public class JavaScriptRuleRepository implements CustomRuleRepository {

    public static final String KEY = "ecocode-javascript";

    public static final String LANGUAGE = "js";

    @Override
    public Set<Language> languages() {
        return EnumSet.of(Language.JAVASCRIPT, Language.TYPESCRIPT);
    }

    @Override
    public String repositoryKey() {
        return KEY;
    }

    @Override
    public List<Class<? extends JavaScriptCheck>> checkClasses() {
        return CheckList.getJavaScriptChecks();
    }

}
