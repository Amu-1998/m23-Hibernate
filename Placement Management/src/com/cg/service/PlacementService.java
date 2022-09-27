package com.cg.service;

import com.cg.entities.Placement;

public interface PlacementService {
	public  abstract Placement addPlacement(Placement placement);
	public abstract Placement updatePlacement(Placement placement);
	public abstract Placement  searchPlacementByid(int id);
}
