/*
 * Copyright 2019 Patriot project
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

package io.patriot_framework.generator.wrappers;

import io.patriot_framework.generator.device.Device;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONWrapper<E> implements DataWrapper<E> {

    private JSONObject jsonObject = new JSONObject();

    @Override
    public String wrapData(Device device, E data) {
        jsonObject.put("name", device.getLabel())
            .put("data", data.toString());

        return jsonObject.toString();
    }

    @Override
    public String wrapData(Device device, HashMap<String, E> data) {
        jsonObject.put("name", device.getLabel());
        for (Map.Entry me : data.entrySet()) {
            jsonObject.put(me.getKey().toString(), me.getValue().toString());
        }

        return jsonObject.toString();
    }

}