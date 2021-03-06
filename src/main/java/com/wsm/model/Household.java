package com.wsm.model;
// Generated May 21, 2016 9:39:06 PM by Hibernate Tools 5.1.0.Alpha1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Household generated by hbm2java
 */
@Entity
@Table(name = "household", catalog = "watermeter")
public class Household implements java.io.Serializable {

	private Integer oid;
	private Building building;
	private SmartMeter smartMeter;
	private BigDecimal householdSize;
	private Boolean ownership;
	private Integer numberPets;
	private BigDecimal householdGardenArea;
	private BigDecimal householdPoolVolume;
	private Boolean second;
	private Boolean public_;
	private Boolean visible;
	private Boolean householdPool;
	private Boolean householdGarden;
	private String familyId;
	private Integer children9;
	private Integer children59;
	private Integer children04;
	private String residencyType;
	private String numberBathrooms;
	private Integer numberAdults;
	private String environmentalAttitude;
	private Boolean irrigationSystem;
	private Set<NeutralUser> neutralUsers = new HashSet<NeutralUser>(0);
	private Set<ComplexDeviceInstance> complexDeviceInstances = new HashSet<ComplexDeviceInstance>(0);

	public Household() {
	}

	public Household(Building building, SmartMeter smartMeter, BigDecimal householdSize, Boolean ownership,
			Integer numberPets, BigDecimal householdGardenArea, BigDecimal householdPoolVolume, Boolean second,
			Boolean public_, Boolean visible, Boolean householdPool, Boolean householdGarden, String familyId,
			Integer children9, Integer children59, Integer children04, String residencyType, String numberBathrooms,
			Integer numberAdults, String environmentalAttitude, Boolean irrigationSystem, Set<NeutralUser> neutralUsers,
			Set<ComplexDeviceInstance> complexDeviceInstances) {
		this.building = building;
		this.smartMeter = smartMeter;
		this.householdSize = householdSize;
		this.ownership = ownership;
		this.numberPets = numberPets;
		this.householdGardenArea = householdGardenArea;
		this.householdPoolVolume = householdPoolVolume;
		this.second = second;
		this.public_ = public_;
		this.visible = visible;
		this.householdPool = householdPool;
		this.householdGarden = householdGarden;
		this.familyId = familyId;
		this.children9 = children9;
		this.children59 = children59;
		this.children04 = children04;
		this.residencyType = residencyType;
		this.numberBathrooms = numberBathrooms;
		this.numberAdults = numberAdults;
		this.environmentalAttitude = environmentalAttitude;
		this.irrigationSystem = irrigationSystem;
		this.neutralUsers = neutralUsers;
		this.complexDeviceInstances = complexDeviceInstances;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "oid", unique = true, nullable = false)
	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "building_oid")
	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "smart_meter_oid")
	public SmartMeter getSmartMeter() {
		return this.smartMeter;
	}

	public void setSmartMeter(SmartMeter smartMeter) {
		this.smartMeter = smartMeter;
	}

	@Column(name = "household_size")
	public BigDecimal getHouseholdSize() {
		return this.householdSize;
	}

	public void setHouseholdSize(BigDecimal householdSize) {
		this.householdSize = householdSize;
	}

	@Column(name = "ownership")
	public Boolean getOwnership() {
		return this.ownership;
	}

	public void setOwnership(Boolean ownership) {
		this.ownership = ownership;
	}

	@Column(name = "number_pets")
	public Integer getNumberPets() {
		return this.numberPets;
	}

	public void setNumberPets(Integer numberPets) {
		this.numberPets = numberPets;
	}

	@Column(name = "household_garden_area")
	public BigDecimal getHouseholdGardenArea() {
		return this.householdGardenArea;
	}

	public void setHouseholdGardenArea(BigDecimal householdGardenArea) {
		this.householdGardenArea = householdGardenArea;
	}

	@Column(name = "household_pool_volume")
	public BigDecimal getHouseholdPoolVolume() {
		return this.householdPoolVolume;
	}

	public void setHouseholdPoolVolume(BigDecimal householdPoolVolume) {
		this.householdPoolVolume = householdPoolVolume;
	}

	@Column(name = "second")
	public Boolean getSecond() {
		return this.second;
	}

	public void setSecond(Boolean second) {
		this.second = second;
	}

	@Column(name = "public")
	public Boolean getPublic_() {
		return this.public_;
	}

	public void setPublic_(Boolean public_) {
		this.public_ = public_;
	}

	@Column(name = "visible")
	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Column(name = "household_pool")
	public Boolean getHouseholdPool() {
		return this.householdPool;
	}

	public void setHouseholdPool(Boolean householdPool) {
		this.householdPool = householdPool;
	}

	@Column(name = "household_garden")
	public Boolean getHouseholdGarden() {
		return this.householdGarden;
	}

	public void setHouseholdGarden(Boolean householdGarden) {
		this.householdGarden = householdGarden;
	}

	@Column(name = "family_id")
	public String getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	@Column(name = "children9")
	public Integer getChildren9() {
		return this.children9;
	}

	public void setChildren9(Integer children9) {
		this.children9 = children9;
	}

	@Column(name = "children5_9")
	public Integer getChildren59() {
		return this.children59;
	}

	public void setChildren59(Integer children59) {
		this.children59 = children59;
	}

	@Column(name = "children0_4")
	public Integer getChildren04() {
		return this.children04;
	}

	public void setChildren04(Integer children04) {
		this.children04 = children04;
	}

	@Column(name = "residency_type")
	public String getResidencyType() {
		return this.residencyType;
	}

	public void setResidencyType(String residencyType) {
		this.residencyType = residencyType;
	}

	@Column(name = "number_bathrooms")
	public String getNumberBathrooms() {
		return this.numberBathrooms;
	}

	public void setNumberBathrooms(String numberBathrooms) {
		this.numberBathrooms = numberBathrooms;
	}

	@Column(name = "number_adults")
	public Integer getNumberAdults() {
		return this.numberAdults;
	}

	public void setNumberAdults(Integer numberAdults) {
		this.numberAdults = numberAdults;
	}

	@Column(name = "environmental_attitude")
	public String getEnvironmentalAttitude() {
		return this.environmentalAttitude;
	}

	public void setEnvironmentalAttitude(String environmentalAttitude) {
		this.environmentalAttitude = environmentalAttitude;
	}

	@Column(name = "irrigation_system")
	public Boolean getIrrigationSystem() {
		return this.irrigationSystem;
	}

	public void setIrrigationSystem(Boolean irrigationSystem) {
		this.irrigationSystem = irrigationSystem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<NeutralUser> getNeutralUsers() {
		return this.neutralUsers;
	}

	public void setNeutralUsers(Set<NeutralUser> neutralUsers) {
		this.neutralUsers = neutralUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<ComplexDeviceInstance> getComplexDeviceInstances() {
		return this.complexDeviceInstances;
	}

	public void setComplexDeviceInstances(Set<ComplexDeviceInstance> complexDeviceInstances) {
		this.complexDeviceInstances = complexDeviceInstances;
	}

}
