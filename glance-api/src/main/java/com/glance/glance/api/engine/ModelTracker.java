package com.glance.glance.api.engine;

import com.glance.glance.api.model.Model;

import java.util.Set;

public interface ModelTracker<AViewer> {

    /**
     * Tracks the specified model.
     *
     * @param model The model to track.
     */
    void track(Model model);

    /**
     * Releases the specified model from tracking.
     *
     * @param model The model to release.
     */
    void release(Model model);

    /**
     * Checks whether the model is currently tracked.
     *
     * @param model The model to check.
     * @return True if tracked, false otherwise.
     */
    boolean isTracked(Model model);

    /**
     * Adds a viewer to the tracking list for the specified model.
     *
     * @param model  The model being tracked.
     * @param viewer The viewer to add.
     */
    void addViewer(Model model, AViewer viewer);

    /**
     * Removes a viewer from the tracking list for the specified model.
     *
     * @param model  The model being tracked.
     * @param viewer The viewer to remove.
     */
    void removeViewer(Model model, AViewer viewer);

    /**
     * Returns the set of viewers tracking the specified model.
     *
     * @param model The model to check.
     * @return A set of viewers.
     */
    Set<AViewer> getViewers(Model model);

    /**
     * Updates visibility and syncs changes for all tracked models.
     */
    void updateAll();

    /**
     * Updates the visibility of a specific model.
     *
     * @param model The model to update.
     */
    void updateVisibility(Model model);

}
