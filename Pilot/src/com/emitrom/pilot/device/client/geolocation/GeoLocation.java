/**
   Copyright (c) 2012 Emitrom LLC. All rights reserved. 
   For licensing questions, please contact us at licensing@emitrom.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.emitrom.pilot.device.client.geolocation;

import com.emitrom.pilot.device.client.core.Module;
import com.emitrom.pilot.device.client.core.ModuleFactory;
import com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler;

public class GeoLocation extends Module {

    private static GeoLocation instance = null;

    public static GeoLocation get() {
        if (instance == null) {
            instance = new GeoLocation();
        }
        return instance;
    }

    private GeoLocation() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = ModuleFactory.createNativeGeoLocation();
    }

    /**
     * Returns the device's current position as a Position object.
     * geolocation.getCurrentPositon is an asynchronous function. It returns the
     * device's current position to the geolocationSuccess callback with a
     * Position object as the parameter. If there is an error, the
     * geolocationError callback is invoked with a PositionError object.
     * 
     * @param handler
     */
    public native void getCurrentLocation(GeoLocationHandler handler)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.getCurrentPosition(
						$entry(function(pos) {
							var positionObject = @com.emitrom.pilot.device.client.geolocation.Position::new(Lcom/google/gwt/core/client/JavaScriptObject;)(pos);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onSuccess(Lcom/emitrom/pilot/device/client/geolocation/Position;)(positionObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.geolocation.PositionError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onError(Lcom/emitrom/pilot/device/client/geolocation/PositionError;)(errorObject);
						}));
    }-*/;

    /**
     * Returns the device's current position as a Position object.
     * geolocation.getCurrentPositon is an asynchronous function. It returns the
     * device's current position to the geolocationSuccess callback with a
     * Position object as the parameter. If there is an error, the
     * geolocationError callback is invoked with a PositionError object.
     * 
     * @param handler
     */
    public native void getCurrentLocation(GeoLocationHandler handler, GeoLocationOptions options)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.getCurrentPosition(
						$entry(function(pos) {
							var positionObject = @com.emitrom.pilot.device.client.geolocation.Position::new(Lcom/google/gwt/core/client/JavaScriptObject;)(pos);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onSuccess(Lcom/emitrom/pilot/device/client/geolocation/Position;)(positionObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.geolocation.PositionError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onError(Lcom/emitrom/pilot/device/client/geolocation/PositionError;)(errorObject);
						}),
						options.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Watches for changes to the device's current position.
     * 
     * @param handler
     */
    public native String watchPosition(GeoLocationHandler handler)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return peer
				.watchPosition(
						$entry(function(pos) {
							var positionObject = @com.emitrom.pilot.device.client.geolocation.Position::new(Lcom/google/gwt/core/client/JavaScriptObject;)(pos);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onSuccess(Lcom/emitrom/pilot/device/client/geolocation/Position;)(positionObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.geolocation.PositionError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onError(Lcom/emitrom/pilot/device/client/geolocation/PositionError;)(errorObject);
						}));
    }-*/;

    /**
     * Watches for changes to the device's current position.
     * 
     * @param handler
     */
    public native String watchPosition(GeoLocationHandler handler, GeoLocationOptions options)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return peer
				.watchPosition(
						$entry(function(pos) {
							var positionObject = @com.emitrom.pilot.device.client.geolocation.Position::new(Lcom/google/gwt/core/client/JavaScriptObject;)(pos);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onSuccess(Lcom/emitrom/pilot/device/client/geolocation/Position;)(positionObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.geolocation.PositionError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.geolocation.GeoLocationHandler::onError(Lcom/emitrom/pilot/device/client/geolocation/PositionError;)(errorObject);
						}),
						options.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Stop watching for changes to the device's location referenced by the
     * watchID parameter.
     * 
     * @param handler
     */
    public native void clearWatch(String watchId)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer.clearWatch(watchId);
    }-*/;

}
