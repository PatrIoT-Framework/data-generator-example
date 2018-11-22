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

package com.redhat.patriot.generator.device;

import com.redhat.patriot.generator.dataFeed.DataFeed;
import com.redhat.patriot.generator.device.units.DeviceUnits;

public class Thermometer extends AbstractDevice implements DeviceUnits<String> {

    public static final String DEFAULT_UNIT = "°C";

    public Thermometer(String label) {
        super(label);
    }

    public Thermometer(String label, DataFeed dataFeed) {
        super(label, dataFeed);
    }

    @Override
    public String getUnit() {
        return DEFAULT_UNIT;
    }

}
