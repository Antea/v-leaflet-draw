package org.vaadin.addon.leaflet.draw.client;

import org.vaadin.addon.leaflet.shared.Point;

import com.vaadin.shared.communication.ServerRpc;

public interface LeafletDrawMarkerServerRcp extends ServerRpc {

	public void markerAdded(Point latLng);

}
