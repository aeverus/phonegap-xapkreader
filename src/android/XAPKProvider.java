package org.android.cordova.xapkreader;

import com.android.vending.expansion.zipfile.APEZProvider;

public class XAPKProvider extends APEZProvider {
        @Override
        public String getAuthority() {
                return "org.android.cordova.xapkreader.expansion";
        }
}
