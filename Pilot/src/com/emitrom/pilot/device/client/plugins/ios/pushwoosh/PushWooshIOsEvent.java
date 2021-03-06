/**
 * Copyright (c) 2013 Emitrom LLC. All rights reserved. For licensing questions,
 * please contact us at licensing@emitrom.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PushWooshIOsEvent extends JsObject {

    PushWooshIOsEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getAlert()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return peer.notification.aps.alert;
    }-*/;

    public native String getSound()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return peer.notification.aps.sound;
    }-*/;

    public native PushWooshIOsObject getUserData()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = peer.notification.u;
		return @com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
