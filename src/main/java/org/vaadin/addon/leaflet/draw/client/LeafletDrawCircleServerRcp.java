package org.vaadin.addon.leaflet.draw.client;

import org.vaadin.addon.leaflet.shared.Point;

import com.vaadin.shared.communication.ServerRpc;

public interface LeafletDrawCircleServerRcp extends ServerRpc {

	public void circleAdded(Point latLng,
			double radius);

}
