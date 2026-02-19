package org.horrorcore;

import org.horrorcore.config.DatabaseConnection;
import org.horrorcore.entity.Sub;
import org.horrorcore.repository.SubRepository;

import java.sql.SQLException;

public class Main {
    static void main() {
        try {
            DatabaseConnection.getInstance().getConnection().isValid(50);
        } catch (SQLException e) {
            System.err.println("DATABASE NOT CONNECTION");
        }

        Sub sub = new Sub("Dreadnought", "Virginia-class", 4300000000.00);
        SubRepository subRepository = new SubRepository();

        subRepository.save(sub);

        System.out.println(
                "Sub Name: "
                        .concat(sub.getSubName())
                        .concat(", Sub Id: ")
                        .concat( String.valueOf(sub.getSubId())));
    }
}
