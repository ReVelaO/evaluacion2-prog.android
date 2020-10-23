package com.example.listaprecios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAdaptador> {

    ArrayList<Avistamiento> aProductos;

    public Adaptador(ArrayList<Avistamiento> aProductos) {
        this.aProductos = aProductos;
        Collections.sort(aProductos);
    }

    @NonNull
    @Override
    public ViewHolderAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adatador,null,false);
        return new ViewHolderAdaptador(vw);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdaptador holder, int position) {
        holder.asignarDatos(aProductos.get(position));
    }

    @Override
    public int getItemCount() {
        return aProductos.size();
    }

    public class ViewHolderAdaptador extends RecyclerView.ViewHolder {

        TextView tv;
        TextView tv2;
        TextView tv3;

        public ViewHolderAdaptador(@NonNull View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.idTextViewAdaptador);
            tv2 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador2);
            tv3 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador3);
        }

        public void asignarDatos(Avistamiento producto) {
            tv.setText("Nombre Ave: " + producto.getNombreAve());
            tv2.setText("Fecha: " + producto.getFecha());
            tv3.setText("Comentario: " + producto.getComentario());
        }
    }
}
