package com.example.bankcardsservice.entity;

import java.io.Serializable;
import java.util.ArrayList;

import com.example.bankcardsservice.util.UserStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    @Size(min=5, message = "Не меньше 5 знаков")
    private String name;

    @Column(name = "password")
    @Size(min=5, message = "Не меньше 5 знаков")
    private String password;

    @Column(name = "role")
    private String role; 
    
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private UserStatus status;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}
    , mappedBy = "user" 
    		/*, fetch = FetchType.EAGER*/
    		)
    @ToString.Exclude
    private ArrayList<Bankcard> bankcardsList;
    
    public void addBankcard(Bankcard bankcard)
    {
    	if (bankcardsList==null)
    	{
    		bankcardsList = new ArrayList<Bankcard>();
    	}
    	bankcardsList.add(bankcard);
    	bankcard.setUser(this);
    }
}