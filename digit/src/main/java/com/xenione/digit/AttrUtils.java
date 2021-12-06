package com.xenione.digit;

/*
 * Copyright (C) 2020-21 Application Library Engineering Group
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

import ohos.agp.components.AttrSet;
import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

/**
 * AttrUtils class.
 */

public class AttrUtils {
    private static final HiLogLabel HI_LOG_LABEL = new HiLogLabel(0, 0, "attrutils");

    AttrSet attrs;

    public AttrUtils(AttrSet attrs) {
        this.attrs = attrs;
    }

    /**
     * Function to get int value from attribute.
     *
     * @param name         String name
     * @param defaultValue int defaultValue
     * @return value
     */
    public int getIntFromAttr(String name, int defaultValue) {
        int value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getIntegerValue();
            }

        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getIntFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get float value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public float getFloatFromAttr(String name, float defaultValue) {
        float value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getFloatValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getFloatFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get boolean value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public boolean getBooleanFromAttr(String name, boolean defaultValue) {
        boolean value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getBoolValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getBooleanFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get Long value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public long getLongFromAttr(String name, long defaultValue) {
        long value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getLongValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getLongFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get Color value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public Color getColorFromAttr(String name, Color defaultValue) {
        Color value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getColorValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getColorFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get Dimension value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public int getDimensionFromAttr(String name, int defaultValue) {
        int value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getDimensionValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getDimensionFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get string value from attribute.
     *
     * @param name         String name
     * @param defaultValue default value
     * @return value
     */
    public String getStringFromAttr(String name, String defaultValue) {
        String value = defaultValue;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getStringValue();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getStringFromAttr exception");
        }
        return value;
    }

    /**
     * Function to get Element value from attribute.
     *
     * @param name  String name
     * @return value
     */
    public Element getElementFromAttr(String name) {
        Element value = null;
        try {
            if (attrs.getAttr(name).isPresent() && attrs.getAttr(name).get() != null) {
                value = attrs.getAttr(name).get().getElement();
            }
        } catch (Exception exception) {
            HiLog.error(HI_LOG_LABEL, "getElementFromAttr exception");
        }
        return value;
    }
}

