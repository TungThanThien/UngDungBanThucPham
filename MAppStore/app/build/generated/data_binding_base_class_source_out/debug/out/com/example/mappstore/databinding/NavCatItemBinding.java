// Generated by view binder compiler. Do not edit!
package com.example.mappstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mappstore.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavCatItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView navCatContent;

  @NonNull
  public final TextView navCatDescription;

  @NonNull
  public final TextView navCatDiscount;

  @NonNull
  public final ImageView navCatImg;

  @NonNull
  public final TextView navCatName;

  private NavCatItemBinding(@NonNull CardView rootView, @NonNull TextView navCatContent,
      @NonNull TextView navCatDescription, @NonNull TextView navCatDiscount,
      @NonNull ImageView navCatImg, @NonNull TextView navCatName) {
    this.rootView = rootView;
    this.navCatContent = navCatContent;
    this.navCatDescription = navCatDescription;
    this.navCatDiscount = navCatDiscount;
    this.navCatImg = navCatImg;
    this.navCatName = navCatName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NavCatItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavCatItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_cat_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavCatItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nav_cat_content;
      TextView navCatContent = ViewBindings.findChildViewById(rootView, id);
      if (navCatContent == null) {
        break missingId;
      }

      id = R.id.nav_cat_description;
      TextView navCatDescription = ViewBindings.findChildViewById(rootView, id);
      if (navCatDescription == null) {
        break missingId;
      }

      id = R.id.nav_cat_discount;
      TextView navCatDiscount = ViewBindings.findChildViewById(rootView, id);
      if (navCatDiscount == null) {
        break missingId;
      }

      id = R.id.nav_cat_img;
      ImageView navCatImg = ViewBindings.findChildViewById(rootView, id);
      if (navCatImg == null) {
        break missingId;
      }

      id = R.id.nav_cat_name;
      TextView navCatName = ViewBindings.findChildViewById(rootView, id);
      if (navCatName == null) {
        break missingId;
      }

      return new NavCatItemBinding((CardView) rootView, navCatContent, navCatDescription,
          navCatDiscount, navCatImg, navCatName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}