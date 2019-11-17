package com.jth.spring.vehicle;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamedJdbcVehicleDao extends NamedParameterJdbcDaoSupport implements VehicleDao {

    private static final String INSERT_SQL = "INSERT INTO vehicle.vehicle(COLOR, WHEEL, SEAT, VEHICLE_NO) VALUES (:color, :wheel, :seat, :vehicleNo)";
    private static final String UPDATE_SQL = "UPDATE vehicle.vehicle SET COLOR=?, WHEEL=?, SEAT=?, WHERE VEHICLE_NO=?";
    private static final String SELECT_ALL_SQL = "SELECT * FROM vehicle.vehicle";
    private static final String SELECT_ONE_SQL = "SELECT * FROM vehicle.vehicle WHERE VEHICLE_NO = ?";
    private static final String DELETE_SQL = "DELETE FROM vehicle.vehicle WHERE VEHICLE_NO=?";
    private static final String COUNT_ALL_SQL = "SELECT COUNT(*) FROM vehicle.vehicle";
    private static final String SELECT_COLOR_SQL = "SELECT COLOR FROM vehicle.vehicle WHERE VEHICLE_NO=?";

    @Override
    public void insert(final Vehicle vehicle) {
        getNamedParameterJdbcTemplate().update(INSERT_SQL, new BeanPropertySqlParameterSource(vehicle));
    }
    @Override
    public void insert(Collection<Vehicle> vehicles) {
        SqlParameterSource[] sources = vehicles.stream()
                .map(v -> new BeanPropertySqlParameterSource(v))
                .toArray(size -> new SqlParameterSource[size]);
        getNamedParameterJdbcTemplate().batchUpdate(INSERT_SQL, sources);
    }

    private void prepareStatement(PreparedStatement ps, Vehicle vehicle) throws SQLException {
        ps.setString(1, vehicle.getColor());
        ps.setInt(2, vehicle.getWheel());
        ps.setInt(3, vehicle.getSeat());
        ps.setString(4, vehicle.getVehicleNo());
    }

    @Override
    public Vehicle findByVehicleNo(String vehicleNo) {
        return getJdbcTemplate().queryForObject(SELECT_ONE_SQL, BeanPropertyRowMapper.newInstance(Vehicle.class), vehicleNo);
    }

    @Override
    public List<Vehicle> findAll() {
        return getJdbcTemplate().query(SELECT_ALL_SQL, BeanPropertyRowMapper.newInstance(Vehicle.class));
    }

    @Override
    public void update(Vehicle vehicle) {
        getJdbcTemplate().update(UPDATE_SQL, ps -> prepareStatement(ps, vehicle));
    }

    @Override
    public void delete(Vehicle vehicle) {
        getJdbcTemplate().update(DELETE_SQL, vehicle.getVehicleNo());
    }

    @Override
    public String getColor(String vehicleNo) {
        return getJdbcTemplate().queryForObject(SELECT_COLOR_SQL, String.class, vehicleNo);
    }

    @Override
    public int countAll() {
        return getJdbcTemplate().queryForObject(COUNT_ALL_SQL, Integer.class);
    }
}
