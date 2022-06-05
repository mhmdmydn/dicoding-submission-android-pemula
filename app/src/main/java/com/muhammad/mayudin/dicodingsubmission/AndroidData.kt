package com.muhammad.mayudin.dicodingsubmission

object AndroidData {
    private val listNames = arrayOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "HoneyComb",
        "Ice Cream Sandwich",
        "Jelly Bean",
        "KitKat",
        "Lollipop",
        "Marshmallow",
        "Nougat",
        "Oreo",
        "Pie",
        "Android 10",
        "Android 11",
        "Android 12"
    )

    private val listReleases = arrayOf(
        "April 27, 2009",
        "September 15, 2009",
        "October 26, 2009",
        "May 20, 2010",
        "February 9, 2011",
        "February 22, 2011",
        "October 19, 2011",
        "July 9, 2012",
        "October 31, 2013",
        "November 12, 2014",
        "October 5, 2015",
        "August 22, 2016",
        "October 25, 2017",
        "August 6, 2018",
        "September 3, 2019",
        "September 8, 2020",
        "October 4, 2021"
    )

    private val listApis = intArrayOf(
        3,
        4,
        5,
        8,
        9,
        11,
        15,
        18,
        19,
        21,
        23,
        24,
        26,
        28,
        29,
        30,
        31
    )

    private val listPhotos = intArrayOf(
        R.drawable.ic_android_1_5,
        R.drawable.ic_android_1_6,
        R.drawable.ic_android_2_0,
        R.drawable.ic_android_2_2,
        R.drawable.ic_android_2_3,
        R.drawable.ic_android_3_0,
        R.drawable.ic_androi_4_0,
        R.drawable.ic_android_4_1,
        R.drawable.ic_android_4_4,
        R.drawable.ic_android_5_1,
        R.drawable.ic_android_6_0,
        R.drawable.ic_android_7_1,
        R.drawable.ic_android_8_0,
        R.drawable.ic_android_9_0,
        R.drawable.ic_android_10,
        R.drawable.ic_android_11,
        R.drawable.ic_android_12
    )

    private val listFeatures = arrayOf("Support for third-party virtual keyboards with text prediction and a user dictionary for custom words.\n" +
            "Support for Widgets – miniature application views that can be embedded in other applications (such as the Home screen) and receive periodic updates.\n" +
            "Video recording and playback in MPEG-4 and 3GP formats.\n" +
            "Auto-pairing and stereo support for Bluetooth (A2DP and AVRCP profiles).\n" +
            "Copy and paste features in web browser.\n" +
            "User pictures shown for Favorites in Contacts.\n" +
            "Specific date/time stamp shown for events in call log, and one-touch access to a contact card from a call log event.\n" +
            "Animated screen transitions.\n" +
            "Auto-rotation option.\n" +
            "New stock boot animation.\n" +
            "Ability to upload videos to YouTube.\n" +
            "Ability to upload photos to Picasa.\n" +
            "Ability to check phone usage history",
        "Voice and text entry search enhanced to include bookmark history, contacts, and the web.\n" +
                "Ability for developers to include their content in search results.\n" +
                "Multi-lingual speech synthesis engine to allow any Android application to \"speak\" a string of text.\n" +
                "Easier searching and the ability to view app screenshots in Android Market.\n" +
                "Gallery, Camera and camcorder more fully integrated, with faster camera access.\n" +
                "Ability for users to select multiple photos for deletion.\n" +
                "Updated technology support for CDMA/EVDO, 802.1x, VPNs, and a text-to-speech engine.\n" +
                "Support for WVGA screen resolutions.\n" +
                "Speed improvements in searching and camera applications.\n" +
                "Expanded Gesture framework and a new GestureBuilder development tool.",
        "Expanded Account sync, allowing users to add multiple accounts to a device for synchronization of an email and contacts.\n" +
                "Microsoft Exchange email support, with a combined inbox to browse an email from multiple accounts in one page.\n" +
                "Bluetooth 2.1 support.\n" +
                "Ability to tap a Contacts photo and select to call, SMS, or email the person.\n" +
                "Ability to search all saved SMS and MMS messages, with the added ability to delete the oldest messages in a conversation automatically deleted when a defined limit is reached.\n" +
                "Numerous new camera features, including flash support, digital zoom, scene mode, white balance, color effect and macro focus.\n" +
                "Improved typing speed on a virtual keyboard, with a smarter dictionary that learns from word usage and includes contact names as suggestions.\n" +
                "Refreshed browser UI with bookmark thumbnails, double-tap zoom and support for HTML5.\n" +
                "Calendar agenda view enhanced, showing attending status for each invitee, and the ability to invite new guests to events.\n" +
                "Optimized hardware speed and revamped UI.\n" +
                "Support for more screen sizes and resolutions, with better contrast ratio.\n" +
                "Improved Google Maps 3.1.2.\n" +
                "MotionEvent class enhanced to track multi-touch events.\n" +
                "Pressure-sensitive touch support in API, even though no according hardware existed at that time.\n" +
                "Addition of live wallpapers, allowing the animation of home-screen background images to show movement.",
        "Speed, memory, and performance optimizations.\n" +
                "Additional application speed improvements, implemented through JIT compilation.\n" +
                "Integration of Chrome's V8 JavaScript engine into the Browser application.\n" +
                "Support for the Android Cloud to Device Messaging (C2DM) service, enabling push notifications.\n" +
                "Improved Microsoft Exchange support, including security policies, auto-discovery, GAL look-up, calendar synchronization and remote wipe.\n" +
                "Improved application launcher with shortcuts to Phone and Browser applications.\n" +
                "USB tethering and Wi-Fi hotspot functionality\n" +
                "Option to disable data access over a mobile network.\n" +
                "Updated Market application with batch and automatic update features.\n" +
                "Quick switching between multiple keyboard languages and their dictionaries.\n" +
                "Support for Bluetooth-enabled car and desk docks.\n" +
                "Support for numeric and alphanumeric passwords.\n" +
                "Support for file upload fields in the Browser application.\n" +
                "The browser now shows all frames of animated GIFs instead of just the first frame only.\n" +
                "Support for installing applications to expandable memory.\n" +
                "Adobe Flash support.\n" +
                "Support for high-PPI displays (up to 320 ppi), such as four-inch 720p screens.\n" +
                "Gallery allows users to view picture stacks using a zoom gesture.",
        "Updated user interface design with increased simplicity and speed.\n" +
                "Support for extra-large screen sizes and resolutions (WXGA and higher).\n" +
                "Native support for SIP VoIP internet telephones.\n" +
                "Faster, more intuitive text input on a virtual keyboard, with improved accuracy, better suggested text and voice input mode.\n" +
                "Enhanced copy/paste functionality, allowing users to select a word by press-holding, copying, and pasting.\n" +
                "Support for Near Field Communication (NFC), allowing the user to read an NFC tag embedded in a poster, sticker, or advertisement.\n" +
                "New audio effects such as reverb, equalization, headphone virtualization, and bass boost.\n" +
                "New Download Manager, giving users easy access to any file downloaded from the browser, email, or another application.\n" +
                "Support for multiple cameras on the device, including a front-facing camera, if available.\n" +
                "Support for WebM/VP8 video playback, and AAC audio encoding.\n" +
                "Improved power management with a more active role in managing applications that are keeping the device awake for too long.\n" +
                "Enhanced support for native code development.\n" +
                "Switched from YAFFS to ext4 on newer devices.\n" +
                "Audio, graphical, and input enhancements for game developers.\n" +
                "Concurrent garbage collection for increased performance.\n" +
                "Native support for more sensors (such as gyroscopes and barometers).\n" +
                "First Android version to feature an Easter egg. It was an image of the Bugdroid standing next to a zombie gingerbread man, with many more zombies in the background.",
        "Optimized tablet support with a new “holographic” user interface (removed again the following year with version 4.2).\n" +
                "New Easter egg, an image of a Tron-themed bumblebee.\n" +
                "Added System Bar, featuring quick access to notifications, status, and soft navigation buttons, available at the bottom of the screen.\n" +
                "Added the Action Bar, giving access to contextual options, navigation, widgets, or other types of content at the top of the screen.\n" +
                "Simplified multitasking – tapping Recent Applications in the System Bar allows users to see snapshots of the tasks underway and quickly jump from one application to another.\n" +
                "Redesigned the keyboard, making typing fast, efficient and accurate on larger screen sizes\n" +
                "Simplified, more intuitive copy/paste interface.\n" +
                "Multiple browser tabs replacing browser windows, plus form auto-fill and a new “incognito” mode allowing somewhat anonymous browsing.\n" +
                "Quick access to camera exposure, focus, flash, zoom, front-facing camera, time-lapse, and other camera features.\n" +
                "Ability to view albums and other collections in full-screen mode in Gallery, with easy access to thumbnails for other photos.\n" +
                "New two-pane Contacts UI and Fast Scroll to let users easily organize and locate contacts.\n" +
                "New two-pane Email UI to make viewing and organizing messages more efficient, allowing users to select one or more messages.\n" +
                "Hardware acceleration.\n" +
                "Support for multi-core processors.\n" +
                "Ability to encrypt all user data.\n" +
                "HTTPS stack improved with Server Name Indication (SNI).\n" +
                "Filesystem in Userspace (FUSE; kernel module).\n" +
                "Disallows applications from having to write access to secondary storage (memory cards on devices with internal primary storage) outside of designated, application-specific directories. Full access to primary internal storage is still allowed through a separate application-level permission",
        "Optimized tablet support with a new “holographic” user interface (removed again the following year with version 4.2).\n" +
                "New Easter egg, an image of a Tron-themed bumblebee.\n" +
                "Added System Bar, featuring quick access to notifications, status, and soft navigation buttons, available at the bottom of the screen.\n" +
                "Added the Action Bar, giving access to contextual options, navigation, widgets, or other types of content at the top of the screen.\n" +
                "Simplified multitasking – tapping Recent Applications in the System Bar allows users to see snapshots of the tasks underway and quickly jump from one application to another.\n" +
                "Redesigned the keyboard, making typing fast, efficient and accurate on larger screen sizes\n" +
                "Simplified, more intuitive copy/paste interface.\n" +
                "Multiple browser tabs replacing browser windows, plus form auto-fill and a new “incognito” mode allowing somewhat anonymous browsing.\n" +
                "Quick access to camera exposure, focus, flash, zoom, front-facing camera, time-lapse, and other camera features.\n" +
                "Ability to view albums and other collections in full-screen mode in Gallery, with easy access to thumbnails for other photos.\n" +
                "New two-pane Contacts UI and Fast Scroll to let users easily organize and locate contacts.\n" +
                "New two-pane Email UI to make viewing and organizing messages more efficient, allowing users to select one or more messages.\n" +
                "Hardware acceleration.\n" +
                "Support for multi-core processors.\n" +
                "Ability to encrypt all user data.\n" +
                "HTTPS stack improved with Server Name Indication (SNI).\n" +
                "Filesystem in Userspace (FUSE; kernel module).\n" +
                "Disallows applications from having to write access to secondary storage (memory cards on devices with internal primary storage) outside of designated, application-specific directories. Full access to primary internal storage is still allowed through a separate application-level permission",
        "Smoother user interface:\n" +
                "Vsync timing across all drawing and animation done by the Android framework, including application rendering, touch events, screen composition and display refresh.\n" +
                "Triple buffering in the graphics pipeline.\n" +
                "CPU input boost.\n" +
                "Synchronizing touch to vsync timing.\n" +
                "Enhanced accessibility.\n" +
                "Bi-directional text and other language support.\n" +
                "User-installable keyboard maps.\n" +
                "Expandable notifications.\n" +
                "TLS v1.1 and v1.2 support added.\n" +
                "Ability to turn off notifications on an application-specific basis.\n" +
                "Shortcuts and widgets can automatically be re-arranged or re-sized to allow new items to fit on home screens.\n" +
                "Bluetooth data transfer for Android Beam.\n" +
                "Tablets with smaller screens now use an expanded version of the interface layout and home screen used by phones.\n" +
                "Improved camera application.\n" +
                "Multichannel audio.\n" +
                "The Fraunhofer FDK AAC codec becomes standard in Android, adding AAC 5.1 channel encoding/decoding.\n" +
                "USB audio (for external sound DACs).\n" +
                "Audio chaining (also known as gapless playback).\n" +
                "Ability for other launchers to add widgets from the application drawer without requiring root access.",
        "Refreshed interface with white elements instead of blue.\n" +
                "Clock no longer shows bold hours; all digits are thin. The H, M, and S markings for the stopwatch and timer have been removed, leaving just the numbers.\n" +
                "Ability for applications to trigger translucency in the navigation and status bars.\n" +
                "Ability for applications to use \"immersive mode\" to keep the navigation and status bars hidden while maintaining user interaction.\n" +
                "Action overflow menu buttons are always visible, even on devices with a \"Menu\" key, which was officially deprecated by Android 4.0.\n" +
                "Write access disabled for user-installed applications on external storage (i.e. MicroSD), except for their own directories inside Android/data.\n" +
                "Purging of app data directories in user storage (internal user storage and MicroSD) upon uninstallation\n" +
                "Optimizations for performance on devices with lower specifications, including zRAM support and \"low RAM\" device API.\n" +
                "Wireless printing capability.\n" +
                "NFC host card emulation, enabling a device to replace smart cards.\n" +
                "WebViews are now based on the Chromium engine (feature parity with Chrome for Android 30).\n" +
                "Expanded functionality for notification listener services.\n" +
                "Public API for developing and managing text messaging clients.\n" +
                "Storage Access Framework, an API allowing apps to retrieve files in a consistent manner. As part of the framework, a new system file picker allows users to access files from various sources (including those exposed by apps, such as online storage services).\n" +
                "New framework for UI transitions.\n" +
                "Sensor batching, step detector and counter APIs.\n" +
                "Settings application now makes it possible to select default text messaging and the home (launcher) application.\n" +
                "Audio tunneling, audio monitoring and loudness enhancer.\n" +
                "Built-in screen recording feature (primarily for developers, as usage of ADB is required).\n" +
                "Native infrared blaster API.\n" +
                "Verified boot.\n" +
                "Enforcing SELinux.\n" +
                "Expanded accessibility APIs and system-level closed captioning settings.\n" +
                "Android Runtime (ART) introduced as a new experimental application runtime environment, not enabled by default, as a replacement for the Dalvik virtual machine.\n" +
                "Bluetooth Message Access Profile (MAP) support.\n" +
                "Disabled access to battery statistics by third-party applications.\n" +
                "Settings application no longer uses a multi-pane layout on devices with larger screens.\n" +
                "Wi-Fi and mobile data activity (TX/RX) indicators are moved to quick settings.\n" +
                "Disables text wrapping in the WebView browser component.",
        "Improvements and bug fixes to the Overview screen.\n" +
                "Ability to join Wi-Fi networks and control paired Bluetooth devices from quick settings.\n" +
                "Official support for multiple SIM cards.\n" +
                "Device protection: if a device is lost or stolen it will remain locked until the owner signs into their Google account, even if the device is reset to factory settings.\n" +
                "High-definition voice calls, available between compatible 4G LTE devices running Android 5.1.\n" +
                "Improvements to the notification priority system, to more closely replicate the silent mode that was removed from Android 5.0.",
        "Precluded rudimentary file manager (package name: com.android.documentsui), accessible from storage settings.\n" +
                "Memory card mounted to /storage/????-????/ rather than /storage/extSdCard/, with a hexadecimal volume serial number in place of the wildcard the question marks.\n" +
                "Contextual search from keywords within apps.\n" +
                "Introduction of Doze mode, which reduces CPU speed while the screen is off in order to save battery life.\n" +
                "App Standby feature.\n" +
                "Alphabetically accessible vertical application drawer.\n" +
                "Application search bar and favorites.\n" +
                "Native fingerprint reader support.\n" +
                "Direct Share feature for target-specific sharing between apps.\n" +
                "Renamed \"Priority\" mode to \"Do Not Disturb\" mode.\n" +
                "App Linking for faster instinctive opening of links with corresponding applications.\n" +
                "Larger Application folders with multiple pages.\n" +
                "Post-install/run-time permission requests.\n" +
                "USB-C support.\n" +
                "Demo Mode feature for screenshot-capture usage.\n" +
                "Automatic full data backup and restore for apps.\n" +
                "4K display mode for apps.\n" +
                "Adoptable External storage to behave like Internal Storage.\n" +
                "MIDI support for musical instruments.\n" +
                "Experimental multi-window feature.\n" +
                "Support for actions by third-party apps in the text selection menu.\n" +
                "App permissions now granted individually at run-time, not all-or-nothing at install time. Similar to App Ops.\n" +
                "Miracast support dropped.\n" +
                "Many new essential commands supported by Android's Linux shell (/bin/sh).\n" +
                "No screen rotation during touch.",
        "Rearranged notification shade.\n" +
                "\"Restart\" option added to power button menu\n" +
                "Touch/display performance improvements.\n" +
                "Moves (Fingerprint swipe down gesture – opt-in).\n" +
                "Opt-in with new hardware required:\n" +
                "Seamless A/B system updates.\n" +
                "Daydream VR mode.\n" +
                "Developer features:\n" +
                "Shortcut manager APIs.\n" +
                "Circular app icons support.\n" +
                "Keyboard image insertion.\n" +
                "Fingerprint sensor gesture to open/close notification shade.\n" +
                "Manual storage manager Intent for apps.\n" +
                "Improved VR thread scheduling.\n" +
                "Enhanced wallpaper metadata.\n" +
                "Multi-endpoint call support.\n" +
                "Support for various MNO requirements.\n" +
                "PCDMA voice privacy property.\n" +
                "Source type support for Visual Voicemail.\n" +
                "Carrier config options for managing telephone videos.\n" +
                "Manual storage manager – identifies files and apps using storage.",
        "Project Treble, the biggest change to the foundations of Android to date: a modular architecture that makes it easier and faster for hardware makers to deliver Android updates.\n" +
                "Picture-in-picture support.\n" +
                "Support for Unicode 10.0 emoji (5.0) and replacement of all blob-shaped emojis by round ones with gradients and outlines.\n" +
                "Redesigned Quick Settings and Settings with a white background and respectively black and Accent font colors.\n" +
                "Restructured Settings by regrouping sections into similar entries.\n" +
                "Adaptive icons\n" +
                "Notification improvements.\n" +
                "Notification channels.\n" +
                "Notification dots (badges).\n" +
                "Notification snoozing.\n" +
                "Notification shade multi-colors (for music album art, messengers, etc.).\n" +
                "System-wide Autofill framework.\n" +
                "Support for AAC, Sony's LDAC and Qualcomm's aptX and aptX HD codecs.\n" +
                "App-specific unknown sources.\n" +
                "Multi-display support.\n" +
                "2 times faster boot time compared to Nougat according to Google, testing on their Pixel devices.\n" +
                "Apps background execution and location limits.\n" +
                "Google Play Protect.\n" +
                "Downloadable fonts.\n" +
                "Integrated printing support.\n" +
                "Color management (deep color and wide color gamut).\n" +
                "Wi-Fi Assistant.",
        "New user interface for the quick settings menu.\n" +
                "The clock has moved to the left of the notification bar.\n" +
                "The \"dock\" now has a semi-transparent background.\n" +
                "Battery Saver no longer shows an orange overlay on the notification and status bars.\n" +
                "A \"screenshot\" button has been added to the power options.\n" +
                "A new \"Lockdown\" mode which disables biometric authentication once activated.\n" +
                "Rounded corners across the UI.\n" +
                "New transitions for switching between apps, or activities within apps.\n" +
                "Richer messaging notifications, where a full conversation can be seen within a notification, full-scale images, and smart replies akin to Google's new app, Reply.\n" +
                "Support for display cutouts.\n" +
                "Redesigned volume slider.\n" +
                "Battery percentage now shown in Always-On Display.\n" +
                "Lock screen security changes include the possible return of an improved NFC Unlock.\n" +
                "Experimental features (which are currently hidden within a menu called Feature Flags) such as a redesigned About Phone page in settings, and automatic Bluetooth enabling while driving.\n" +
                "DNS over TLS.\n" +
                "A new optional gesture-based system interface, allowing users to navigate the OS using swipes more often than the traditional UI.\n" +
                "Redesigned multitask app switcher with the Google search bar and app drawer built-in.\n" +
                "Android Dashboard, which tells the user how much time they are spending on their device and in apps, and allows the user to set time limits on apps.\n" +
                "\"Shush\", an enhanced version of Do Not Disturb mode activated by placing the phone face down, which mutes standard notifications.\n" +
                "\"Adaptive Battery\" prediction, which makes use of Doze to hibernate user apps the OS determines the user will not use.\n" +
                "Auto-Brightness feature modifies screen brightness based on user habits.\n" +
                "Wind Down option lets Android users set a specific bedtime that enables Do Not Disturb and turns the entire phone's interface gray to discourage further use at night.\n" +
                "Vulkan 1.1 support.\n" +
                "Call recording options fully disabled",
        "Revamped full-screen gesture navigation with new app open/close animations.\n" +
                "Scoped storage restrictions\n" +
                "New permissions required to access location in background and to access photo, video and audio files.\n" +
                "Background apps can no longer jump into the foreground.\n" +
                "Limited access to non-resettable device identifiers.\n" +
                "Background (idle) access to camera, microphone and sensors disabled for more privacy protection with the side effect of disabling antitheft software.\n" +
                "Sharing shortcuts, which allow sharing content with a contact directly.\n" +
                "Floating settings panel, that allows changing system settings directly from apps.\n" +
                "Dynamic depth format for photos, which allow changing background blur after taking a photo.\n" +
                "Support for the AV1 video codec, the HDR10+ video format and the Opus audio codec.\n" +
                "Support for aptX Adaptive, LHDC, LLAC, CELT and AAC LATM codecs\n" +
                "A native MIDI API, allowing interaction with music controllers.\n" +
                "Better support for biometric authentication in apps.\n" +
                "Support for the WPA3 Wi-Fi security protocol.\n" +
                "Support for foldable phones.\n" +
                "Support for Notification Bubbles.\n" +
                "New system-wide dark theme/mode\n" +
                "TLS v1.3 support added.\n" +
                "Project Mainline, allows core OS components to be updated via the Google Play Store, without requiring a complete system update",
        "Chat bubbles.\n" +
                "Screen recorder.\n" +
                "Notification history.\n" +
                "New permissions controls.\n" +
                "API distinction between standalone 5G NR and non-standalone 5G.\n" +
                "One-time permission\n" +
                "Permissions auto-reset.\n" +
                "Wireless Android Auto on devices with 5GHz Wi-Fi.\n" +
                "Increased number of updatable core OS components in Google Play from 12 to 21.\n" +
                "Enterprise work profile privacy protections now apply on company-owned devices.\n" +
                "Independent left and right edge sensitivity for gesture navigation.",
        "Easier Wi-Fi sharing.\n" +
                "AVIF image support.\n" +
                "Material You, an updated design language based on Material Design.\n" +
                "Scrolling Screenshot.\n" +
                "One Handed Mode.\n" +
                "Android Runtime (ART) module added to the updatable core OS components via Google Play, added functionality to existing modules.\n" +
                "Area Magnification can zoom in any content on device.\n" +
                "Extra Dim reduces brightness below minimum level.\n" +
                "Bold Text.\n" +
                "Greyscale.\n" +
                "Mic and Camera indicator and toggle.[citation needed]\n" +
                "Option to choose precise or approximate location.\n" +
                "Privacy Dashboard.\n" +
                "Gestures can work in immersive mode.\n" +
                "Performance improvements to system services to improve transitions, power efficiency, and reduce app startup times.\n" +
                "Third party app stores now have the ability to update apps without constantly asking the user for permission."
    )

    val listData: ArrayList<Android>
        get() {
            val list = arrayListOf<Android>()

            for(position in listNames.indices){
                val android = Android(
                    listNames[position],
                    listReleases[position],
                    listApis[position],
                    listFeatures[position],
                    listPhotos[position]
                )
                list.add(android)
            }

            return list
        }
}