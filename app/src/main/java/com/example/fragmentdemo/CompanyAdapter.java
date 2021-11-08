package com.example.fragmentdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {

    ArrayList<Company> mCompanies;
    OnCompanyItemClickListener mListener;

    public interface OnCompanyItemClickListener {
        void onCompanyItemClick(Company company);
    }

    public CompanyAdapter(ArrayList<Company> mCompanies, OnCompanyItemClickListener mListener) {
        this.mCompanies = mCompanies;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public CompanyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View convertView = layoutInflater.inflate(R.layout.layout_cell, parent, false);

        return new ViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyAdapter.ViewHolder holder, int position) {
        final Company company = mCompanies.get(position);
        holder.tvName.setText(company.getName());
        //holder.tvDescription.setText(company.getDescription());
        holder.logo.setImageResource(company.getLogo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onCompanyItemClick(company);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCompanies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        //TextView tvDescription;
        ImageView logo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.company_tvName);
            //tvDescription = itemView.findViewById(R.id.tvDescription);
            logo = itemView.findViewById(R.id.company_imgLogo);
        }
    }
}
