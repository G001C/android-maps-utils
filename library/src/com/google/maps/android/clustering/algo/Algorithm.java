package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.Projection;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;

import java.util.Set;

/**
 * Logic for computing clusters
 */
public interface Algorithm<T extends ClusterItem> {
    void addItem(T item);

    void removeItem(T item);

    Set<? extends Cluster<T>> getClusters(double zoom);
}