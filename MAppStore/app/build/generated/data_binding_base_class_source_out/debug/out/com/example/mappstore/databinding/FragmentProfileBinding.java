// Generated by view binder compiler. Do not edit!
package com.example.mappstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mappstore.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText profileAddress;

  @NonNull
  public final EditText profileEmail;

  @NonNull
  public final ImageView profileImg;

  @NonNull
  public final EditText profileName;

  @NonNull
  public final EditText profileNumber;

  @NonNull
  public final Button update;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText profileAddress, @NonNull EditText profileEmail,
      @NonNull ImageView profileImg, @NonNull EditText profileName, @NonNull EditText profileNumber,
      @NonNull Button update) {
    this.rootView = rootView;
    this.profileAddress = profileAddress;
    this.profileEmail = profileEmail;
    this.profileImg = profileImg;
    this.profileName = profileName;
    this.profileNumber = profileNumber;
    this.update = update;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profile_address;
      EditText profileAddress = ViewBindings.findChildViewById(rootView, id);
      if (profileAddress == null) {
        break missingId;
      }

      id = R.id.profile_email;
      EditText profileEmail = ViewBindings.findChildViewById(rootView, id);
      if (profileEmail == null) {
        break missingId;
      }

      id = R.id.profile_img;
      ImageView profileImg = ViewBindings.findChildViewById(rootView, id);
      if (profileImg == null) {
        break missingId;
      }

      id = R.id.profile_name;
      EditText profileName = ViewBindings.findChildViewById(rootView, id);
      if (profileName == null) {
        break missingId;
      }

      id = R.id.profile_number;
      EditText profileNumber = ViewBindings.findChildViewById(rootView, id);
      if (profileNumber == null) {
        break missingId;
      }

      id = R.id.update;
      Button update = ViewBindings.findChildViewById(rootView, id);
      if (update == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, profileAddress, profileEmail,
          profileImg, profileName, profileNumber, update);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}