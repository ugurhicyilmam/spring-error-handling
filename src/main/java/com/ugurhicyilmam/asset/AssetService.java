package com.ugurhicyilmam.asset;

import org.springframework.stereotype.Service;

@Service
public class AssetService {
    AssetDto assetById(long assetId) {
        throw new AssetNotFoundException();
    }
}
