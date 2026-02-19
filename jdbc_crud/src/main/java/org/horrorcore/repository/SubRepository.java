package org.horrorcore.repository;

import org.horrorcore.config.DatabaseConnection;
import org.horrorcore.entity.Sub;

import java.math.BigDecimal;
import java.sql.*;

public class SubRepository {
    private final Connection connection;

    //We have given the connection object to the repository for use
    public SubRepository() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public Sub save(Sub sub) {
        String sql = "INSERT INTO subs(sub_name, sub_type, cost) VALUE(?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, sub.getSubName());
            ps.setString(2, sub.getSubType());
            ps.setDouble(3, sub.getCost());
            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("NEW SUB ADDED");
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    rs.next();
                    sub.setSubId(rs.getLong("sub_id"));
                }
            }
            return sub;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
