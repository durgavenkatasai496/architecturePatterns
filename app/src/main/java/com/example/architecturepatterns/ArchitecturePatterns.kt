package com.example.architecturepatterns

/*
 * 1-4-2025 :
 * difference between MVC,MVP,MVI,MVVM :
 * Android architectures :
 *
 * 1.MVC(Model-view-controller)
 * 2.MVP(Model-View-presenter)
 * 3.MVVM(Model-View-ViewModel)
 * 4.MVI (Model-View-Intent).
 *
 *
 * 1.MVC :
 * MVC is oldest pattern.
 * Structure:
 * Model: Handles data and business logic.
 *        Example : Responsibility holding data ,
 * View: Displays UI elements (e.g., Activity, Fragment).
 *
 * Controller: Controls interactions between Model and View (often the Activity or Fragment in Android).
 *             Example : Controller or intermediate.
 *
 * 2.MVP :
 * Structure: Similar to MVC
 * Model: Handles data (same as MVC).
 * View: Displays UI elements but does not handle logic (Activity, Fragment, View).
 * Presenter: Acts as a middleman between Model and View.
 *
 *
 * 3.MVVM :
 * (Model-View-ViewModel) - Recommended for Modern Android.
 * 🛠 Google-recommended architecture for Android (Used with Jetpack ViewModel, LiveData, Flow)
 * Structure:
 * Model: Handles data.
 * View: UI (Activity, Fragment).
 *       It Communicating ViewModel Via Data binding or observable.
 *
 * ViewModel: Prepares data and presentation logic for the view.
 * it notifies the view of changes via observables through LiveData without directly manipulating view.
 * Stores and manages UI-related data. Survives configuration changes (e.g., screen rotation).
 * Life Cycle Awareness.
 *
 *
 * 📌 Improvement:
 * Uses LiveData or StateFlow to automatically update the View when data changes.
 *
 * 4.MVI (Model-View-Intent) :
 * Model: Data source.
 * View: UI.
 * Intent: User actions.
 *
 * State: A single source of truth for UI state.
 *
 * Main Purpose of Architecture :
 * Separation of Concern.
 */