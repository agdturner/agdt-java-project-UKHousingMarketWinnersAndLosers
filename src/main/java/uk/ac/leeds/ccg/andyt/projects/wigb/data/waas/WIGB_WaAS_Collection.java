/*
 * Copyright 2018 geoagdt.
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
package uk.ac.leeds.ccg.andyt.projects.wigb.data.waas;

import java.util.HashMap;

/**
 *
 * @author geoagdt
 */
public class WIGB_WaAS_Collection {

    private final short ID;

    /**
     * The keys are CASEW1 and the values are the collectionID where those data
     * are stored.
     */
    private final HashMap<Short, Short> lookup;

    /**
     * The keys are CASEW1, the values are the respective combined record.
     */
    private final HashMap<Short, WIGB_WaAS_Combined_Record> data;

    public WIGB_WaAS_Collection(short ID) {
        this.ID = ID;
        lookup = new HashMap<>();
        data = new HashMap<>();
    }

    /**
     * @return the ID
     */
    public short getID() {
        return ID;
    }

    /**
     * @return the lookup
     */
    public HashMap<Short, Short> getLookup() {
        return lookup;
    }

    /**
     * @return the data
     */
    public HashMap<Short, WIGB_WaAS_Combined_Record> getData() {
        return data;
    }

}
