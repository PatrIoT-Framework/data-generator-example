/*
 * Copyright 2018 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.redhat.patriot.generator.dataFeed;

/**
 * Created by jsmolar on 9/11/18.
 */
public class ConstantDataFeed implements DataFeed<Double> {

    private String label;

    private double timer;

    public ConstantDataFeed(double timer) {
        this.timer = timer;
    }

    @Override
    public Double getNextValue(Object... params) {
        return timer;
    }

    @Override
    public Double getPreviousValue() {
        return timer;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }

}
